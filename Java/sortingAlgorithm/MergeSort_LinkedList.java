package sortingAlgorithm;

public class MergeSort_LinkedList {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    class MergeSortLinkedList {
        Node head;

        // 새로운 노드 추가
        public void add(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        public void printList(Node node) {
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.next;
            }
            System.out.println();
        }

        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            // 분할 과정
            Node mid = getMid(head);
            Node nextOfMid = mid.next;

            // mid의 next를 Null로 설정하여 끝을 마킹함으로써 리스트를 두 부분으로 나눔.
            mid.next = null;

            // head부터 mid까지
            Node left = mergeSort(head);
            // mid + 1 부터 끝까지
            Node right = mergeSort(nextOfMid);

            Node sortedList = sortedMerge(left, right);
            return sortedList;
        }

        public Node sortedMerge(Node a, Node b) {
            Node result;

            if (a == null) {
                return b;
            }

            if (b == null) {
                return a;
            }

            // 정렬
            if (a.value <= b.value) {
                result = a;
                result.next = sortedMerge(a.next, b);
            } else {
                result = b;
                result.next = sortedMerge(a, b.next);
            }
            return result;
        }

        // 투포인터 (토끼와 거북이 알고리즘)
        public Node getMid(Node head) {
            if (head == null) {
                return head; // 빈 리스트의 경우 중간 노드는 없음.
            }

            Node slow = head, fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
