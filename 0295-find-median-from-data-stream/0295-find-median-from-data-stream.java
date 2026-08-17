class MedianFinder {

    PriorityQueue<Integer> left =
        new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> right =
        new PriorityQueue<>();

    public MedianFinder() {
    }

    public void addNum(int num) {

        // Put number in left
        left.add(num);

        // Make sure every element in left <= every element in right
        if (!right.isEmpty() && left.peek() > right.peek()) {
            right.add(left.poll());
            left.add(right.poll());
        }

        // Balance the sizes
        if (left.size() > right.size() + 1) {
            right.add(left.poll());
        }
    }

    public double findMedian() {

        if (left.size() > right.size()) {
            return left.peek();
        }

        return (left.peek() + right.peek()) / 2.0;
    }
}