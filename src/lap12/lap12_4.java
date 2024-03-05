package lap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// bái toán xin chữ ký
public class lap12_4 {
    // tính điểm tối ưu để kết thúc
    private static int[] optimalPoints(Segment[] segments) {
        //write your code here
        Arrays.sort(segments, (a,b) ->Integer.compare(a.end, b.end) );
        List<Integer> pointsList = new ArrayList<>();
        int currentPoint = segments[0].end;
        pointsList.add(currentPoint);
        for (int i = 1; i < segments.length; i++) {
            if (currentPoint < segments[i].start || currentPoint > segments[i].end) {
                // Nếu thời điểm hiện tại không nằm trong đoạn thời gian của đoạn kế tiếp
                currentPoint = segments[i].end; // Chọn thời điểm kết thúc của đoạn thời gian hiện tại
                pointsList.add(currentPoint);
            }
        }
        int[] points = new int[2 * segments.length];
        for (int i = 0; i < segments.length; i++) {
            points[2 * i] = segments[i].start;
            points[2 * i + 1] = segments[i].end;
        }
        return points;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
