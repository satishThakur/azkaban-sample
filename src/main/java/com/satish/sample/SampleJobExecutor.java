package com.satish.sample;

import azkaban.utils.Props;

public class SampleJobExecutor {
	
	public SampleJobExecutor(String name, Props props){
		System.out.println("Name: " + name + ", props: " + props);
	}
	
	public void run(){
		System.out.println("Running job SampleJobExecutor");
	}
	
	
	public static void main(String[] args){
		System.out.println("In Main() SampleJobExecutor");
	}

}
