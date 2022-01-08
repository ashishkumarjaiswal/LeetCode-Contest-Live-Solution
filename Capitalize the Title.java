class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 3) {
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }
        String ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans + " " + arr[i];
        }
        return ans;
    }
}
