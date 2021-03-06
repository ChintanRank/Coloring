# Coloring
Graph-Coloring Problem Algorithm 
Graph Coloring
----- --------
The classical graph coloring problem is just the following:
color the nodes of an undirected graph so that
neighbors do not have the same color, and a minimum
number of colors are used. This problem has many
applications, among which are allocating variables to
registers by a compiler. The compiler considers two
variables to be neighbors if they are needed in the
same block of code.
The graph coloring problem is very hard to solve (its
NP complete). But there is a problem that is easy to
solve that can lead to good enough, but not optimal,
graph coloring solutions. It is this: make a list of
the nodes of the graph so that each node has no more
than M-1 neighbors after it in the list. Then the graph
can be colored with M colors, which can be assigned from
the end of the list to the beginning. For each node, at
most M-1 neighbors have been assigned colors before the
node is, so with M colors the node can always be assigned
a color different from any of its neighbors.
You are asked to find the minimum M such that the list
can be made.
Input
-----
For each of several cases:
A line containing the number N of nodes.
1 <= N <= 80.
N lines each containing N binary digits
(`0's and `1's).
Nodes are identified by integers i, 1 <= i <= N.
Lines of digits are numbered 1, 2, 3, from the first
line to the last line. Digits in a line are numbered
1, 2, 3, from left to right.
For 1 <= i,j <= N, digit j of line i is `1' if node
i is a neighbor of node j, and `0' otherwise. Digit
j of line i equals digit i of line j, and digit i of
line i is `0' (a node is NOT a neighbor of itself).
No lines contain any spaces. The input terminates
with an end of file.
Output
------
For each case, the single line containing M, the
smallest integer for which the nodes of the graph can
be put in a list such that at most M-1 neighbors of
any node appear after the node in the list.
Example Input
------- -----
4
0111
1011
1101
1110
4
0101
1010
0101
1010
5
01111
10000
10000
10000
10000
Example Output
------- ------
432
File: coloring.txt
Author: Bob Walton <walton@deas.harvard.edu>
Date: Sat Oct 18 08:27:15 EDT 2003
The authors have placed this file in the public domain;
they make no warranty and accept no liability for this
file.
