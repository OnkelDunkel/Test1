# Test1

## Ex1 White-box techniques

### Pt1

Look in /src/main/java for implementation.

### Pt2

See unit tests in /src/test/java.

### Pt3

See jacoco/index.html for Jacoco report.

## Ex2 Black-box techniques

### Pt1

*Partitions:*

* Valid, full fare (00:00 AND <09:30)
* Valid, saver ticket (09:30 AND <16:00)
* Valid, full fare (16:00 AND <19:30)
* Valid, saver ticket (19:30 AND <24:00)

*Boundary testing:*

* -01.00
* 00.00
* 00.01
* 09:29
* 09:30
* 09:31
* 15:59
* 16:00
* 16:01
* 19:29
* 19:30
* 19:31
* 23:59
* 24:00
* 25:00
* abc

### Pt2

Test case design helps identify weakness and is especially good for when the system start being complicated and you might overlook important test cases.
