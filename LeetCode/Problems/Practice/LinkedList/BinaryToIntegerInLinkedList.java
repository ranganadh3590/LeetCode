package LeetCode.Problems.Practice.LinkedList;

public class BinaryToIntegerInLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode secondNode = new ListNode(1);
		ListNode thirdNode = new ListNode(1);
		head.next = secondNode;
		secondNode.next = thirdNode;
		// print the linked List
		ListNode current = head;
        String binaryString = "";
		while (current != null) {
			System.out.print(current.data + "-->");
			binaryString += current.data;
			current = current.next;
		}
		System.out.println(binaryString);
		int decimalNum = Integer.parseInt(binaryString,2);
		System.out.println(decimalNum);
		

	}

}
