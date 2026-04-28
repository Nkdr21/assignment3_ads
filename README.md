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

| Array size | Bubble Sort (random) | Bubble Sort (sorted) | Merge Sort (random) | Merge Sort (sorted) | Binary Search |
| ---------- | -------------------- | -------------------- | ------------------- | ------------------- | ------------- |
| 10 | 4041 ns | 1250 ns | 5500 ns | 3834 ns | 667 ns |
| 100 | 139583 ns | 80916 ns | 60667 ns | 50250 ns | 833 ns |
| 1000 | 11446875 ns | 1783083 ns | 117041 ns | 71083 ns | 2250 ns |


## Analysis
#### Which sort was faster?
For small arrays (size 10), bubble sort was actually slightly faster than merge sort. But starting from size 100, merge sort became faster. At size 1000 the difference was huge – bubble sort took 11,446,875 ns while merge sort only took 117,041 ns. That's almost 100 times faster. This makes sense because bubble sort is O(n²) and merge sort is O(n log n).
Does it matter if the array is already sorted?
Yes, a lot. Bubble sort on sorted array at size 1000 was 1,783,083 ns compared to 11,446,875 ns on random – about 6 times faster. Because when the array is already sorted, bubble sort does fewer or no swaps. Merge sort also improved a bit on sorted arrays but not as dramatically.
#### Does size matter?
Definitely. Going from 100 to 1000 elements, bubble sort got about 80 times slower. Merge sort only got about 2 times slower. This clearly shows O(n²) vs O(n log n) in practice.
Why does binary search need a sorted array?
Because it uses the order of elements to decide where to look next. If the array is random, you can't assume anything about where the target might be. Binary search was very fast in all cases – even at size 1000 it only took 2250 ns.

1.<img width="1389" height="868" alt="image" src="https://github.com/user-attachments/assets/1922b5d0-d7cd-4919-b4e0-3890dc83b0d9" />
2.<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/56c57465-acf8-4452-9e57-863d90a4e6c4" />


## Reflection
This assignment helped me actually see the difference between O(n²) and O(n log n) with real numbers. Before this I knew the theory but seeing bubble sort take 11 million nanoseconds while merge sort took only 117 thousand made it really click.
The hardest part was writing the merge function in merge sort. Getting the indexes right took me a few tries but once I drew it out on paper it made more sense. I also found it interesting that for very small arrays bubble sort was actually faster than merge sort – that surprised me at first but then I realized merge sort has extra overhead from splitting and copying arrays.


## Code:

#### Sorter.java:
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/0c0b38d7-7d3c-45d4-bdfb-eed28a974e25" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/33466345-0759-4eb5-a1a1-c80b77dc4b6a" />

#### Searcher.java:
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/470cc6e1-1b3d-475d-9a00-1df3da4c0702" />

#### Experiment.java:
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/9e5d4681-5aaf-4b37-b02f-c0bed6cc6877" />
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/d2301e46-8fab-40b1-ac50-e3d4b020a1c2" />

#### Main.java:
<img width="1440" height="900" alt="image" src="https://github.com/user-attachments/assets/8070b6df-a55f-4435-8cfa-14ff8d287738" />
