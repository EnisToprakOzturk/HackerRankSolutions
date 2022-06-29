import math
import os
import random
import re
import sys


def simpleArraySum(ar):
    i = 0
    summery = 0
    for x in ar:
        summery = summery + ar[i]
        i += 1
    return summery


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ar_count = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = simpleArraySum(ar)

    fptr.write(str(result) + '\n')

    fptr.close()
