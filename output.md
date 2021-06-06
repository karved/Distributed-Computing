#Input

![alt text](https://github.com/karved/Distributed-Computing/Raymond/r.png)

#Output

Tree Creation
\--------------------

Enter Root Node: 1
Any Child Nodes !?      
1 for Yes and 0 for No: 1
Enter all childs for 1: 2,3

Any Child nodes for 2   
1 for Yes and 0 for No: 1
Enter all childs for 2: 4,5

Any Child nodes for 4   
1 for Yes and 0 for No: 0

Any Child nodes for 5   
1 for Yes and 0 for No: 0

Any Child nodes for 3   
1 for Yes and 0 for No: 1
Enter all childs for 3: 6,7,8

Any Child nodes for 6   
1 for Yes and 0 for No: 0

Any Child nodes for 7   
1 for Yes and 0 for No: 0

Any Child nodes for 8   
1 for Yes and 0 for No: 0

Tree List [1, 2, 3, 4, 5, 6, 7, 8]  
Parent List [1, 1, 1, 2, 2, 3, 3, 3]
\[[], [], [], [], [], [], [], []]    

Token at:  1

1. Add request
2. Pass Token
3. End
2

Empty

\[[], [], [], [], [], [], [], []]

Token at:  1

1. Add request
2. Pass Token
3. End
1
Enter Request node: 8
\[[3], [], [8], [], [], [], [], [8]]

Token at:  1

1. Add request
2. Pass Token
3. End
1
Enter Request node: 2
\[[3, 2], [2], [8], [], [], [], [], [8]]

Token at:  1

1. Add request
2. Pass Token
3. End
1
Enter Request node: 6
\[[3, 2], [2], [8, 6], [], [], [6], [], [8]]

Token at:  1

1. Add request
2. Pass Token
3. End
2
\[[2], [2], [8, 6, 1], [], [], [6], [], [8]]

Token at:  3

1. Add request
2. Pass Token
3. End
2
\[[2], [2], [6, 1], [], [], [6], [], [3]]

Token at:  8

1. Add request
2. Pass Token
3. End
2
\[[2], [2], [6, 1], [], [], [6], [], []]

Token at:  3

1. Add request
2. Pass Token
3. End
2
\[[2], [2], [1], [], [], [3], [], []]

Token at:  6

1. Add request
2. Pass Token
3. End
1
Enter Request node: 7
\[[2, 3], [2], [1, 7], [], [], [3], [7], []]

Token at:  6

1. Add request
2. Pass Token
3. End
2
\[[2, 3], [2], [1, 7], [], [], [], [7], []]

Token at:  3

1. Add request
2. Pass Token
3. End
2
\[[2, 3], [2], [7], [], [], [], [7], []]

Token at:  1

1. Add request
2. Pass Token
3. End
3

Over
