# Insertion Sort:

is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. 
Values from the unsorted part are picked and placed at the correct position in the sorted part.

## First Three Passes:

![Insertion Sort part 1](https://user-images.githubusercontent.com/83535791/139598538-033f83bc-7984-474b-aa77-63f3545752ba.png)

## 4 to 7 Passes:
![Insertion Sort 2](https://user-images.githubusercontent.com/83535791/139598619-7bb26ba2-67f3-47e1-9415-824d5987bde0.png)


### Efficiency:
**Time Complexity: O(n^2)** 
**Auxiliary Space: O(1)**

# Merge Sort:
It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves.

## First Pass:

![MergeSortPass1](https://user-images.githubusercontent.com/83535791/139692221-dd5f3350-cf87-4b7e-bf46-109c54567305.png)

## Second Pass:
![MergeSortPass2](https://user-images.githubusercontent.com/83535791/139692284-e7eb72ac-e94d-4b17-a9bd-d406653a0149.png)

## Third Pass:
![MergeSortPass3](https://user-images.githubusercontent.com/83535791/139692331-77514cb5-0325-4609-8239-ce42eacb87e9.png)

## Final Pass:
![MergeSortFinalPass](https://user-images.githubusercontent.com/83535791/139692393-d7bef8cf-aba5-44b0-b535-2f43c7825911.png)

### Efficiency:
Big O Notation:
**Time complexity is O(n)** in worst case because it a recursive algorithm
**Space Complexity is O(n)** because of the Divide and Conquer.

# Quick Sort:

## First Pass:

![QuickSortPass1](https://user-images.githubusercontent.com/83535791/139922766-c58e82ad-87f0-42c8-81d7-8e46e3496387.png)

## Second Pass:
![QuickSortPass2](https://user-images.githubusercontent.com/83535791/139922805-0f32a98d-272b-46b6-b3c4-a5103e6cae7b.png)

## 3 and 4 pass:

![QuickSortPass3and4](https://user-images.githubusercontent.com/83535791/139922903-1cfb1f57-540a-4907-800e-bbf4f790baa1.png)

## 5 and 6 pass:

![QuickSortPass5and6](https://user-images.githubusercontent.com/83535791/139922949-30ed1089-4574-4a3e-9e40-7864bd3f6a7b.png)

## Effeciency:
Big O Notation:
Time complexity is O(nlogn) in worst case because it a recursive algorithm
Space Complexity is O(n) because of the Divide and Conquer.





