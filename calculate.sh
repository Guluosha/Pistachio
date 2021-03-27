#!/usr/bin/bash
inputArray=(8 3 9 5 10 2)
bubbleSort() {
  for ((marginIndex = 0; marginIndex < ${#inputArray[*]}; marginIndex++)); do
    echo "数字：${inputArray[marginIndex]}"
  done
}
bubbleSort
