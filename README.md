# Assignment 3 – Sorting and Searching
## Student:Anuarbek Nurkadyr

### I chose:
#### Bubble Sort (basic)
#### Merge Sort (advanced)
#### Binary Search (searching)



## How each algorithm works
### Bubble Sort
Bubble sort goes through the array and compares two elements next to each other. If the left one is bigger than the right one, it swaps them. It keeps doing this until nothing needs to be swapped. It's simple but slow for big arrays because it has to do a lot of comparisons.
Time complexity: O(n²)
### Merge Sort
Merge sort splits the array into two halves, sorts each half recursively, then combines them back together in order. It's faster than bubble sort especially when the array is large.
Time complexity: O(n log n)
### Binary Search
Binary search only works on sorted arrays. It looks at the middle element, and if the target is smaller it goes left, if bigger it goes right. This way it cuts the search area in half every step.
Time complexity: O(log n)


## Results
I ran each algorithm on arrays of size 10, 100, and 1000. Both random and already sorted arrays were tested.
Array sizeBubble Sort (random)Bubble Sort (sorted)Merge Sort (random)Merge Sort (sorted)Binary Search104041 ns1250 ns5500 ns3834 ns667 ns100139583 ns80916 ns60667 ns50250 ns833 ns100011446875 ns1783083 ns117041 ns71083 ns2250 ns


## Analysis
#### Which sort was faster?
For small arrays (size 10), bubble sort was actually slightly faster than merge sort. But starting from size 100, merge sort became faster. At size 1000 the difference was huge – bubble sort took 11,446,875 ns while merge sort only took 117,041 ns. That's almost 100 times faster. This makes sense because bubble sort is O(n²) and merge sort is O(n log n).
Does it matter if the array is already sorted?
Yes, a lot. Bubble sort on sorted array at size 1000 was 1,783,083 ns compared to 11,446,875 ns on random – about 6 times faster. Because when the array is already sorted, bubble sort does fewer or no swaps. Merge sort also improved a bit on sorted arrays but not as dramatically.
#### Does size matter?
Definitely. Going from 100 to 1000 elements, bubble sort got about 80 times slower. Merge sort only got about 2 times slower. This clearly shows O(n²) vs O(n log n) in practice.
Why does binary search need a sorted array?
Because it uses the order of elements to decide where to look next. If the array is random, you can't assume anything about where the target might be. Binary search was very fast in all cases – even at size 1000 it only took 2250 ns.

<img width="1389" height="868" alt="image" src="https://github.com/user-attachments/assets/1922b5d0-d7cd-4919-b4e0-3890dc83b0d9" />


## Reflection
This assignment helped me actually see the difference between O(n²) and O(n log n) with real numbers. Before this I knew the theory but seeing bubble sort take 11 million nanoseconds while merge sort took only 117 thousand made it really click.
The hardest part was writing the merge function in merge sort. Getting the indexes right took me a few tries but once I drew it out on paper it made more sense. I also found it interesting that for very small arrays bubble sort was actually faster than merge sort – that surprised me at first but then I realized merge sort has extra overhead from splitting and copying arrays.
