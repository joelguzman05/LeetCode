/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list2 = slow.next;
        ListNode prev = slow.next = null;
        while (list2 != null) {
            ListNode tmp = list2.next;
            list2.next = prev;
            prev = list2;
            list2 = tmp;
        }

        ListNode list1 = head;
        list2 = prev;
        while (list2 != null) {
            ListNode tmp1 = list1.next;
            ListNode tmp2 = list2.next;
            list1.next = list2;
            list2.next = tmp1;
            list1 = tmp1;
            list2 = tmp2;
        }
    }
}