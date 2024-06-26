package LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }

    static void printList(ListNode head)
    {
        System.out.println("\n----Printing----\n");
        while(head!=null)
        {
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("\n----Done---\n");
    }
    
    static ListNode arraytoLinkedList(int arr[]) {
        return arraytoLinkedList(arr,0);
    }
    
    static ListNode arraytoLinkedList(int arr[],int index) {
        if(index>=arr.length){
            return null;
        }
        return new ListNode(arr[index], arraytoLinkedList(arr,index+1));
    }

}
