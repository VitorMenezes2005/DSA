import services.binaryTree.traversals.inorder.BinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // FREQUENCY MAPS
//    Map<Character, Integer> freq = FrequencyMaps.frequencyMap("BANANA");
//    System.out.println(freq);

//    String impressão = TwoPointer.letras("Let's take LeetCode contest");
//    System.out.println(impressão);

//    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    BinarySearch.binarySearch(nums, 3);

//    SlidingWindow.slidingWindow("bcbbbcba");

//    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 30};
//    ExponentialSearch.exponentialSearch(nums, 32);

//    int[] nums = {1, 2, 3, 1};
//    System.out.println(ContainsDuplicate.containsDuplicate(nums));

//    System.out.println(firstUniqChar.firstUniqChar("loveleetcode"));

//    int[] prices = {7,1,5,3,6,4};
//    System.out.println(LeetCode121.maxProfit(prices));

//    int[] nums = {3,2,4};
//    int target = 6;
//    int[] resolution = LeetCode001.twoSun(nums, target);
//    System.out.println(resolution[0]);
//    System.out.println(resolution[1]);

//    System.out.println(LeetCode917.reverseOnlyLetters("a-bC-dEf-ghIj"));

//    DoublyLinkedList list = new DoublyLinkedList();
//
//    list.addToFront(10);
//    list.addToFront(5);
//    list.addToEnd(20);
//    list.addToEnd(30);
//
//    list.printForward(); // 5 10 20 30
//
//    System.out.println(list.removeFromFront()); // 5
//    System.out.println(list.removeFromEnd());   // 30
//
//    list.printForward(); // 10 20

//    ListNode head = new ListNode(1,
//            new ListNode(2,
//                    new ListNode(3,
//                            new ListNode(4,
//                                    new ListNode(5)))));
//
//    System.out.println("Lista original:");
//    printList(head);
//
//    ListNode reversed = reverseList(head);
//
//    System.out.println("Lista invertida:");
//    printList(reversed);

//    int[] nums = {5,4,3,2,1};
//    int[] nums2 = {1,2,3,4,5};
//    int[] nums3 = {1,2,5,4,3};
//    System.out.println(Arrays.toString(BubbleSort.bubble(nums)));
//    System.out.println("-------------------------");
//    System.out.println(Arrays.toString(BubbleSort.bubble(nums2)));
//    System.out.println("-------------------------");
//    System.out.println(Arrays.toString(BubbleSort.bubble(nums3)));

//    int[] values = {4, 2, 1, 3};
//
//    System.out.println("Unsorted Linked List:");
//    services.sorting.mergeSort.ListNode head = buildLinkedList(values);
//    printLinkedList(head);
//
//    ListNode sortedHead = mergeSort(head);
//
//    System.out.println("Sorted Linked List:");
//    printLinkedList(sortedHead);

//    int[] nums = {3,0,1};
//    System.out.println(LeetCode268.missingNumber(nums));

//    BinaryTree tree = new BinaryTree();
//
//    int[] valuesToInsert = {10, 5, 15, 3, 7, 12, 18};
//
//    for (int val : valuesToInsert) {
//        tree.insert(val);
//    }
//
//    System.out.println(tree.search(7));   // true
//    System.out.println(tree.search(14));  // false
//    System.out.println(tree.search(10));  // true
//    System.out.println(tree.search(31));  // false

//    BinaryTree tree = new BinaryTree();
//
//    int[] valuesToInsert = {10, 5, 15, 3, 7, 12, 18};
//
//    for (int val : valuesToInsert) {
//        tree.insert(val);
//    }
//
//    System.out.println(tree.search(7));   // true
//    System.out.println(tree.search(14));  // false
//    System.out.println(tree.search(10));  // true
//    System.out.println(tree.search(31));  // false

//    BinaryTree tree = new BinaryTree();
//
//    int[] valuesToInsert = {10, 5, 15, 3, 7, 12, 18};
//
//    for (int val : valuesToInsert) {
//        tree.insert(val);
//    }

//    System.out.println(tree.preOrderTraversal());

    BinaryTree tree = new BinaryTree();

    int[] valuesToInsert = {10, 5, 15, 3, 7, 12, 18};

    for (int val : valuesToInsert) {
        tree.insert(val);
    }

    System.out.println(tree.inorderTraversal());
}