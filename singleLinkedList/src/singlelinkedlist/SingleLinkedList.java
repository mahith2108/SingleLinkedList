/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;



/**
 *
 * @author mahith
 */
public class SingleLinkedList<T> {

    /**
     * @param args the command line arguments
     */
    
    private Node<T> tail;
    private Node<T> head;
    
    public void add(T value){
    
       Node nd=new Node<T>();
       nd.setValue(value);
       System.out.println("adding element"+ " "+ nd.getValue());
       
          if(head==null){
           // System.out.println("first element");
           head=nd;
           tail=nd;
         }
    
         else{ 
           tail.setNextRef(nd);
           tail=nd;
         }
    
 }
    
    public void traverse(){
      Node<T> tmp1=null;
      Node<T> tmp=head;   
       while(true){
       
          if(tmp==null){
              
           // System.out.print("empty list");
            break;
          }
          
          System.out.println(tmp.getValue());
          tmp=tmp.getNextRef();
          
       }
    
    }
    
    public void addAfter(T value,T value1){
    
     Node<T> tmp1=null;   
     Node<T> tmp=head;   
       while(true){
       
          if(tmp==null){
              
           // System.out.print("empty list");
            break;
          }

          if(tmp.getValue()==value){
             
             tmp1=tmp.getNextRef();
             Node nv=new Node<T>();
             nv.setValue(value1);
             nv.setNextRef(tmp1);
             tmp.setNextRef(nv);
          }
          tmp=tmp.getNextRef();
          
       }
    
    }

    public void deleteAfter(T val){
       
        Node<T> tmp=head;     
        Node<T> tmp1=null;
    while(true)
    {
        if(tmp==null){
              
            System.out.print("empty list");
            break;
        }           
       if(tmp.getValue()==val){
          
           tmp1=tmp.getNextRef();
           tmp.setNextRef(tmp1.getNextRef());
           break;
       }
       tmp=tmp.getNextRef();
    }
   
 }   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    SingleLinkedList<Integer> s=new SingleLinkedList<Integer>();
    s.add(5);
    s.add(6);
    s.addAfter(5,4);
    s.addAfter(6,8);
    s.deleteAfter(6);
    s.deleteAfter(4);
    s.traverse();
    
    }
    
}

class Node<T> implements Comparable<T>{

 private Node nextref;
 private T value;
    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public void setValue(T value){
   
      this.value=value;
   
   }

   public T getValue(){
   
       return value;
   }
   
   public void setNextRef(Node nextref){
   
       this.nextref=nextref;
       
   }

   public Node<T> getNextRef(){
   
      return nextref;
   }

  
}











