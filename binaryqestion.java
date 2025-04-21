1. Iterative Binary Search
java
Copy
Edit
int binarySearch(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] < x) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
2. Recursive Binary Search
java
Copy
Edit
int binarySearch(int[] arr, int x, int low, int high) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == x) return mid;
    if (arr[mid] > x) return binarySearch(arr, x, low, mid - 1);
    return binarySearch(arr, x, mid + 1, high);
}
3. Using Arrays.binarySearch()
java
Copy
Edit
int binarySearch(int[] arr, int x) {
    return java.util.Arrays.binarySearch(arr, x);
}
4. Generic Binary Search
java
Copy
Edit
<T extends Comparable<T>> int binarySearch(T[] arr, T x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        int cmp = arr[mid].compareTo(x);
        if (cmp == 0) return mid;
        if (cmp < 0) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
5. Binary Search on a Descending Array
java
Copy
Edit
int binarySearchDesc(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] > x) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
6. First Occurrence of Target
java
Copy
Edit
int firstOccurrence(int[] arr, int x) {
    int low = 0, high = arr.length - 1, result = -1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            result = mid;
            high = mid - 1;
        } else if (arr[mid] < x) low = mid + 1;
        else high = mid - 1;
    }
    return result;
}
7. Last Occurrence of Target
java
Copy
Edit
int lastOccurrence(int[] arr, int x) {
    int low = 0, high = arr.length - 1, result = -1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            result = mid;
            low = mid + 1;
        } else if (arr[mid] < x) low = mid + 1;
        else high = mid - 1;
    }
    return result;
}
8. Binary Search for Insertion Point
java
Copy
Edit
int findInsertPosition(int[] arr, int x) {
    int low = 0, high = arr.length;
    while (low < high) {
        int mid = (low + high) / 2;
        if (arr[mid] < x) low = mid + 1;
        else high = mid;
    }
    return low;
}
9. Binary Search with Overflow Prevention
java
Copy
Edit
int binarySearch(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] < x) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
10. Binary Search on a Rotated Sorted Array
java
Copy
Edit
int search(int[] arr, int x) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        if (arr[low] <= arr[mid]) {
            if (x >= arr[low] && x < arr[mid]) high = mid - 1;
            else low = mid + 1;
        } else {
            if (x > arr[mid] && x <= arr[high]) low = mid + 1;
            else high = mid - 1;
        }
    }
    return -1;
}
