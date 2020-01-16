# Parallel Performance Catalogue

- Extends Palladio with a new Architectural Templates Catalogue. This new catalogue contains templates for some of the most popular parallel programming approaches. 
- More information about [Architectural Templates](https://sdqweb.ipd.kit.edu/wiki/Architectural_Templates)

---------
## Parallel Loops AT
Parallel Loops is an approach that results in parallel computation on multiple indices of a data structure at the same time using loops. Each loop is represented by a unit of execution, and no information is transferred between these loops. The Parallel Loops pattern is defined by its ease of achieving parallelism. A set of independent data can be split into smaller subsets. When provided with an amount of N units of execution, the same amount of (almost) equal-sized subsets of the initial set of data can be computed at once with little overhead.

One typical example of the pattern is matrix multiplication. In a standard sequential implementation, there are three nested loops calculating each entry in the resulting matrix. With the usage of the Parallel Loops approach, these loops can be executed in parallel since each iteration writes in a different entry. The parallelization of these iterations can result in a significantly faster computation and better utilization of multi-core CPUs.

The Parallel Loops AT enables the users to save a lot of manual modeling work by requiring them to model only a single parallel loop. Then after the application of the AT and the specification of the AT parameters, the rest of the parallel loops from the thread pool are created automatically.

#### Creating a Loop Action

In order to apply the Parallel Loop AT you need to create a Loop Action first. Follow these steps to accomplish this:

1. Open the SEFF Diagram in which you want to create the Loop Action.
2. Select a Loop Action from the palette and add it to the diagram. Resize the objects if necessary.
3. Specify the number of repetitions in the middle field.
4. Select an Internal Action from the palette and add it to the diagram. Resize the objects if necessary.
5. Add a Resource Demand from the palette to the Internal Action and specify it.
6. Connect the actions with control flow links.

After completing the steps, your Loop Action is successfully created and should look like this:

![](https://i.imgur.com/bc4X2LK.png)



#### Applying the Parallel Loops AT [estimated time: 5 min.]

#### Prerequisite: A component whose SEFF Diagram contains a LoopAction that you want to parallelize.

Execute the following steps on the System model: 

1. Choose **Add Architectural Template** from the palette and click on the **defaultSystem** to apply a template on your system.
1. In the popup, choose the **AT Parallel Loops** Architectural Template to apply the template. Confirm with **OK**.

![](https://i.imgur.com/vOG59l1.png)

3. The system is now enabled for the Parallel Loops Architectural Template. Whenever we want to work with an Architectural Template, enabling it for the system is the first step. The editor for the system illustrates the Architectural Template application with a grey box.

![](https://i.imgur.com/wphMVhW.png)


4. Right click on the project and select refresh.

![](https://i.imgur.com/VfvP4SM.png)


5. Select the repository in the tree editor, right click on it and select apply profile. Find and select the Parallel Loops profile. Click Add and then OK. Refresh the project.

![](https://i.imgur.com/KmawU1o.png)


![](https://i.imgur.com/4TxydZ3.png)



6. Select the loop action in the tree editor, right click on it and select apply stereotype. Select the stereotype, click add and then OK. Refresh the project.

![](https://i.imgur.com/W2YBBa4.png)


![](https://i.imgur.com/phnzU6X.png)


7. Select the stereotype, switch to properties view and specify the AT parameters.

![](https://i.imgur.com/tUKXtkc.png)

![](https://i.imgur.com/OVQTw5w.png)


8. The AT is now successfully applied.

## Fork-Join AT



How to create a Fork Action:
1. Go to the SEFF diagra.
2. Select the Fork Action from the palette
3. Add a Synchronization Point from the palette to the Fork Action
4. Add a Resource Demanding Behavior from the palette and add it to the Synchronization Point.
5. Now create your actions inside the Resource Demanding Behavior

Repeat steps 4 and 5 according to wished number of threads.
