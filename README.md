# Topological Sort
Cormen structure of topological using depth-first search in Java.

## Usage
First line: N that is the number of vertices. M that is the number of edges.

Next M lines: src that is the number of the source vertex and dst that is the number of destination vertex.

## Example
```shell
9 9
1 2
1 3
2 4
3 4
5 8
5 9
6 9
8 9
8 2
```

9 vertices and 9 edges.
First from vertex 1 to 2, second from 1 to 3, etc.

#### Return
```shell
7 6 5 8 9 1 3 2 4
```
