class Solution {
    public int pairSum(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int max = 0;
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int x = arr.get(i) + arr.get(j);
            if (x > max) {
                max = x;
            }
            i++;
            j--;
        }
        return max;
    }
}
