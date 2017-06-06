package com.compit.programming.basics.datastructure.heap;

import java.util.Arrays;
import java.util.Random;
/**
 * @author: chaudharimehul
 * @date:	Jun 4, 2017
 * Heap version 1 with array
 * -99 will be used for denoting null value
 */
public class Heapv1 {

	HeapNode rootNode;
	
	private int maxSpace = 5;
	private int maxNodeIndex = -1;
	private int data[] = new int[5];
	
	public Heapv1(){
		nullifyRoot();
	}

	public Heapv1(int root){
		this.data[0] = root;
	}
	
	boolean isEmpty(){
		return (this.data[0] == -99)?true:false;
	}
	void nullifyRoot(){
		this.data[0] = -99;		
	}
	
	public void findMax(){
		
	}
	
	public void insert(int data){
		
	}
	
	public void delete(){
		
	}
	
	public void replace(){
		
	}
	
	public void swapData(int oldIndex, int newIndex){

		System.out.println("\n Before data swap : old index[" + oldIndex + "], new index[" + newIndex + "] -- oldIndexData[" + this.data[oldIndex] +"], newIndexData["+this.data[newIndex]+"]");

		int tempData = this.data[oldIndex];
		this.data[oldIndex] = this.data[newIndex];
		this.data[newIndex] = tempData;
	}
	
	public void increaseSize(){
		if((this.maxNodeIndex+1) == this.maxSpace){
			this.maxSpace *= 2;
			this.data = Arrays.copyOf(this.data, this.maxSpace);
		}
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Heap is empty");
		}
		return this.data[0];
	}

	public int poll(){
		
		int root = this.data[0];
		
		if(isEmpty()){
			System.out.println("Heap is empty");
		}
		
		if(this.maxNodeIndex == 0){
			nullifyRoot();
		}else{
			this.data[0] = this.data[this.maxNodeIndex];			
		}
		
		this.maxNodeIndex--; //decrease the count for number of nodes
		
		heapDown();
		
		return root;
	}
	
	public boolean hasLeftChild(int index){
		return (index*2 < this.maxNodeIndex)?true:false;
	}
	
	public int getLeftChildIndex(int index){
		return (index*2)+1;
	}
	
	public boolean hasRightChild(int index){
		return ((index *2)+1 < this.maxNodeIndex)?true:false;
	}
	public int getRightChildIndex(int index){
		return (index*2)+2;
	}
	
	public int getRightChild(int index){
		return this.data[getRightChildIndex(index)];
	}
	
	public int getLeftChild(int index){
		return this.data[getLeftChildIndex(index)];
	}
	public void heapDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int childIndexToSwap = getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index) > this.data[index] && getRightChild(index) > getLeftChild(index) ){
				childIndexToSwap = getRightChildIndex(index);
			}
			if(this.data[index] > this.data[childIndexToSwap]){
				break;
			}else{
				swapData(index, childIndexToSwap);
			}
			index = childIndexToSwap;
		}
	}
	
	public void add(int data){
		
		if(isEmpty()){
			this.data[0] = data;
		}else{
			increaseSize();
			this.data[this.maxNodeIndex+1] = data; 
		}

		this.maxNodeIndex++;
		
		heapUp();
	}
	
	public boolean hasParent(int index){
		return (getParentIndex(index) >= 0)?true:false;
	}
	
	public int getParent(int index){
		return this.data[getParentIndex(index)];
	}
	
	public int getParentIndex(int index){
		return (index>0)?(index-1)/2:0;
	}
	
	public void heapUp(){
		int index = this.maxNodeIndex;
		
		while(hasParent(index) && getParent(index) < this.data[index]){
			swapData(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	public int[] getData(){
		return this.data;
	}

	public int getMaxNodeIndex(){
		return this.maxNodeIndex;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Heapv1 heap = new Heapv1();
		String seperator = "----------------------";

		System.out.println("Random generated data: ");
		int inputData;
		
		for(int i = 0 ; i < 10 ; i++){
			inputData = random.nextInt(20);
			System.out.print("[" + inputData + "],");
			heap.add(inputData);
		}

		System.out.println(seperator);

		System.out.println("\nData after added to heap: ");
		int[] data = heap.getData();

		for(int i = 0 ; i <= heap.getMaxNodeIndex() ; i++){
			System.out.print("["+data[i]+"],");
		}

		System.out.println("\n"+seperator);
		System.out.println("\nPeek : " + heap.peek() );

		System.out.println("Poll: " + heap.poll() );

		System.out.println("\n"+seperator);
		System.out.println("\nData after removing root node: ");
		data = heap.getData();

		for(int i = 0 ; i <= heap.getMaxNodeIndex() ; i++){
			System.out.print("["+data[i]+"],");
		}

		System.out.println("\n"+seperator);
		System.out.println("\nPoll: " + heap.poll() );
		System.out.println(seperator);

		System.out.println("Data after removing second root node: ");
		data = heap.getData();

		for(int i = 0 ; i <= heap.getMaxNodeIndex() ; i++){
			System.out.print("["+data[i]+"],");
		}
		System.out.println("\n"+seperator);

	}

}
