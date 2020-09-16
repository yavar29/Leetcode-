public class Solution {
    public boolean hasCycle(ListNode head) {
    Set<ListNode> list = new HashSet<>();
    while (head != null) {
        if (list.contains(head)) {
            return true;
        } else {
            list.add(head);
        }
        head = head.next;
    }
    return false;
}
}