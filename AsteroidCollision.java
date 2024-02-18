/*
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 

Constraints:

2 <= asteroids.length <= 104
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0
*/

class myStack{
    
   
    int[] stack = new int[10000];
    int top;

    public myStack(){
        this.top=-1;
    }

    public boolean isEmpty()
    {
    if (top==-1)
    {
        return true;
    }
    return false;
    }



    public void push(int data)
    {
        stack[++top]=data;
    }

    public int pop()
    {
        
        return stack[top--];

    }

    public int peek()
    {

        return stack[top];

    }
}

class Solution {
    public boolean isSame(int a, int b) {
        return (a >= 0 && b >= 0) || (a < 0 && b < 0);
    }

    public int[] asteroidCollision(int[] asteroids) {
        myStack s = new myStack();

        for(int a : asteroids){

            if(s.isEmpty() || a>0){
                s.push(a);
            }
            
            else{
                while(!s.isEmpty()){
                    int top= s.peek();

                    if(top<0){
                        s.push(a);
                        break;
                    }
                    int modval=Math.abs(a);
                    if(modval==top){
                        s.pop();
                        break;
                    }
                    else if(modval<top){
                        break;
                    }
                    else{
                        s.pop();
                        if(s.isEmpty()){
                            s.push(a);
                            break;
                        }
                    }
                }



            }
            


        }

        // Copy the stack elements into a new array
        int size = s.top + 1;
        int[] result = new int[size];
        for (int j = 0; j < size; j++) {
            result[j] = s.stack[j];
        }

        return result;
    }
}
