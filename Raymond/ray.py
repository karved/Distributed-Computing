
def childs(L):
    for i in range(len(L)):
        yn = int(input("\nAny Child nodes for "+str(L[i])+"\n1 for Yes and 0 for No: "))

        if (yn == 1):
            L1 = list(map(int, input("Enter all childs for "+str(L[i])+": ").split(',')))
            nodes.extend(L1)
            for j in range(len(L1)):
                parent.append(L[i])

            childs(L1)

def addp(req):
    if( ( parent[req] != parent[((parent[req])-1)]) and ((req+1) not in pd[((parent[req])-1)] ) ):
        pd[((parent[req])-1)].append((req+1))
        addp((parent[req])-1)
    elif (req+1) not in pd[((parent[req])-1)] :
        pd[((parent[req])-1)].append((req+1))

def add():
    req =int(input("Enter Request node: "))
    if ((not pd[(req-1)]) and (req not in pd[(req-1)])):
        pd[(req-1)].append(req)
        addp((req-1))
    

def passt(token):
    if not any(pd):
        print("\nEmpty\n")
        return token
    else:
        token = (token - 1)
        newtoken = pd[(token)].pop(0)
       

        if newtoken in pd[newtoken-1]:
            pd[newtoken-1].remove(newtoken)

        if ((len(pd[token])!= 0) and ((token+1) not in pd[(newtoken)-1])):
            pd[(newtoken)-1].append(token+1)
            
        return newtoken


print("Tree Creation")
print("--------------------\n")

root = int(input("Enter Root Node: "))
nodes =[root]
parent = [root]
token = root

yn = int(input("Any Child Nodes !?\n1 for Yes and 0 for No: "))


if (yn == 1):
    L = list(map(int, input("Enter all childs for "+str(root)+": ").split(',')))
    nodes.extend(L)
    for i in range(len(L)):
        parent.append(root)
    
    childs(L)

print()
print("Tree List",nodes)
print("Parent List",parent)


pd = [[] for _ in range(len(nodes))]
end =0

while(end != 3):

    print(pd)
    print("\nToken at: ",token)
    end = int(input("\n1. Add request\n2. Pass Token\n3. End\n"))
    if (end == 1):
        add()
    elif (end == 2):
        token = passt(token)


print("\nOver")

