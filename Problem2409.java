class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aStart = getDay(arriveAlice, days);
        int aEnd = getDay(leaveAlice, days);
        int bStart = getDay(arriveBob, days);
        int bEnd = getDay(leaveBob, days);
        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);
        return Math.max(0, end - start + 1);
    }
    private int getDay(String date, int[] days) {
        String[] arr = date.split("-");

        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}