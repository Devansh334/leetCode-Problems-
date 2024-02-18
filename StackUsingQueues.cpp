/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
 

Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, top, and empty.
All the calls to pop and top are valid.
*/

class MyStack {
public:
    int f1;
    int r1 ;
    int f2 ;
    int r2 ;
    int queue1[1000];
    int queue2[1000];
    MyStack() {
        this->f1=-1;
        this->f2=-1;
        this->r1=-1;
        this->r2=-1;
    }
    
    void push(int x) {
        if (f1 == -1)
    {	
		f1++;
    }
	while(!empty()){
		if(f2==-1){
			f2++;
		}
		queue2[++r2]=queue1[r1--];
	}

    queue1[++r1] = x;
	
	while(!empty2()){
		if(f1==-1){
			f1++;
		}
		queue1[++r1]=queue2[r2--];
	}
    }
    
    int pop() {
    if (empty())
    {
        
        exit(0);
    }
        return queue1[f1++];
    }
    
    int top() {
    if (empty())
    {
       
        exit(0);
    }
    return queue1[f1];
    }
    
    bool empty() {
        if (f1 == -1 || f1 > r1)
    {	
		
        return true;
    }
    return false;
    }

    bool empty2() {
        if (f2 == -1 || f2 > r2)
    {	
		
        return true;
    }
    return false;
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */
