package com.java.async;

/**
 * Created with IntelliJ IDEA.
 * User: simon
 * Date: 2017/1/6
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class DeliveryOrder implements Cake {
	private CakeBaker cakeBaker = null;

	private boolean ready = false;

	public synchronized void setCakeBaker(CakeBaker cakeBaker) {
		if (ready) {
			return; // 防止setCakeBaker被调用两次以上。
		}
		this.cakeBaker = cakeBaker;
		this.ready = true;
		notifyAll();
	}

	public synchronized String getCake() {
		while (!ready) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return cakeBaker.getCake();
	}

}
