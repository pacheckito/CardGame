import java.util.*;

public class JavaQueues {
   public static void main(String[] args){
       /*
       -------- Queue --------
       (A) Take a look at the documentation for Queue 
(https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)
       (B) Is Queue a concrete class, abstract class, or 
interface?
       (C) Can we instantiate objects from the Queue class?
       (D) What does the type parameter represent for the Queue 
class?
       (E) Look at the methods required by Queue. What is the 
difference between add/remove/element and offer/poll/peek?
       -------- Collection --------
       (A) Queue extends Collection (a superinterface). Take a 
look at the documentation for Collection
           
(https://docs.oracle.com/javase/8/docs/api/java/util/Collection.h
tml)
       (B) Look at the section.
           What two classes listed there are data structures we 
have already worked with?
       (C) Any class implemented Collection must provide 
implementations for all of the methods listed in the
           documentation for Collection. For each of the 
following methods required by Collection, what is the
           expected behavior (i.e. describe what the method does)
when implemented?
           i. size
           ii. isEmpty
           iii. contains
           iv. add
           v. remove
           vi. iterator
       -------- Iterable --------
       Collection extends Iterable, which means implementing 
Queue requires implementing the methods of Iterable. Take
       a look at the documentation for Collection 
(https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.htm
l).
       We have already seen the requirements of Iterable in 
ArrayList and Stack: Iterable requires a method iterator
       that returns an Iterator object (with hasNext() and next()
methods). Iterable also allows the use of the foreach
       (enhanced for) loop. If you need a refresher on this, see
        
https://docs.oracle.com/javase/8/docs/technotes/guides/language/f
oreach.html.
       -------- Deque --------
       (A) Take a look at the documentation for Deque 
(https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html)
       (B) Is Deque a concrete class, abstract class, or 
interface?
       (C) Can we instantiate objects from the Deque class?
       (D) What is the relationship between Deque and Queue?
       (E) What additional functionality (kinds of methods) does 
Deque specify?
       -------- ArrayDeque --------
       (A) Take a look at the documentation for ArrayDeque
       
(https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.h
tml)
       (B) Is ArrayDeque a concrete class, abstract class, or 
interface?
       (C) Can we instantiate objects from the ArrayDeque class?
       (D) What is the relationship between ArrayDeque and Deque?
       (E) Complete the TODOs below
        */
       // TODO: make an empty ArrayDeque object for Strings
       // TODO: use 4 different methods to add 8 new elements to        the back of the ArrayDeque
       // TODO: use 3 different methods to add 6 new elements to the front of the ArrayDeque
       // TODO: print the size of the ArrayDeque
       // TODO: print the ArrayDeque directly
       // TODO: use 2 different methods to view the element at theback of the ArrayDeque
              // TODO: use 4 different methods to view the element at thefront of the ArrayDeque
       // TODO: use 2 different methods to remove the back elementof the ArrayDeque
       // TODO: use 5 different methods to remove the front element of the ArrayDeque
       // TODO: print the elements of the ArrayDeque using a foreach loop
       // TODO: print the elements of the ArrayDeque using Iterator
       // TODO: print the elements of the ArrayDeque using descendingIterator
       // TODO: check if an element is in the ArrayDeque using contains
       /*
       -------- PriorityQueue --------
       (A) Take a look at the documentation for PriorityQueue
       
(https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueu
e.html)
       (B) Is PriorityQueue a concrete class, abstract class, or 
interface?
       (C) Can we instantiate objects from the PriorityQueue 
class?
       (D) What is the relationship between PriorityQueue and 
Queue?
       (E) How is the highest priority element determined?
       (F) Complete the TODOs below
        */
       // TODO: make an empty PriorityQueue object for Integers
       // TODO: use 2 different methods to add a few elements to the PriorityQueue
       // TODO: use 2 different methods to view the highest priority element
       // TODO: use 2 different methods to remove the highest priority element
       /*
       -------- Stack using ArrayDeque --------
       (A) Complete the TODOs below
        */
       // TODO: make an empty ArrayDeque for Integers; we will treat this as a stack
       // TODO: using only the method push, add numbers to the stack
       // TODO: using the method pop, remove a number from the stack
       // as we have seen previously, the Java Stack class does not iterate top -> bottom
       // Iterator, printing, foreach all go bottom -> top
       // TODO: directly print the stack; what is the order?
       // TODO: use a foreach loop to print the stack; what is the order?
   }
}
