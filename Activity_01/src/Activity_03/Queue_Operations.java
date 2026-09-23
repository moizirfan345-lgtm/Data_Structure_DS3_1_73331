/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity_03;

/**
 *
 * @author Moiz
 */
public class Queue_Operations {
 
    static final int CAPACITY = 5;
    static int[] stack = new int[CAPACITY];
    static int top = -1;  
 
    
    public static void push(int value) {
        if (top == CAPACITY - 1) {
            System.out.println("Stack Overflow! Cannot push " + value + ", stack is full.");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println("Pushed: " + value);
    }
 
    
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop, stack is empty.");
            return;
        }
        System.out.println("Popped: " + stack[top]);
        top--;
    }
 
    // Peek: show the top element without removing it
    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek.");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }
 
    // Display: show all elements currently in the stack (top first)
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        // Demonstration sequence required by the lab
        push(10);
        push(20);
        push(30);
 
        display();   // expect: 30 20 10
        peek();      // expect: 30
        pop();       // removes 30
        display();   // expect: 20 10
    }
}