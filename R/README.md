#TTOSOM How to

All parameters must be strings, including learning rate, etc. this is because the integration with java.

###Parameters

* dataset the training arff file 
* topology The topology is specified in a text file in one line specifying the number of children per node following the guidelines of the describe topopology method described in
* iterations the total number of training iterations
* initRadius initial value for the radius of the bubble of activity
* finalRadius final value for the radius of the bubble of activity
* initLearning initial value for the learning rate.
* finalLearning final value for the learning rate.
* distance the type of distance, 0: Euclidean 1: Manhattan
* input -i for input file
* inputFile the source file where a TTOSOM (including topology and values for the weights) will be loaded.
* output -o for output file
* outputFile the source file where a TTOSOM (including topology and values for the weights) will be saved.
* stats -x for cross validation, -t for test set ,-c for clustering
* option_stats number of folds if -x in stats, path test set if -t in stats, nothing if -c in stats
* seed -s for seed value
* seed_value the new value of the seed


###Default parameters 

We include default parameters in the TTOSOM.r file which are 

* topology = "topology.txt"
* iterations = "10"
* initRadius = "8"
* finalRadius = "0"
* initialLearning = "0.9"
* finalLearning = "0.0"
* distance="0"
* inputFile=""
* outputFile=""
* stats=""
* option_stats=""
* seed_value=""

You must have the "rJava" package installed.

For more details about the parameters go to the Java folder and open README

###Examples

* Example 1.

This example loads the TTOSOM script and then executes the classifier with default parameters and returns the tree

`source("ttosom.r") #this loads the TTOSOM script`
`tree <- ttosom(dataset="iris.arff") #This executes the TTOSOM with the iris dataset and the default parameters.`


* Example 2

This example loads the TTOSOM script and then executes 10-fold cross-validation with 100.000 iterations, initial radius=8, final radius=0, initial learning rate=0.9, final learning rate= 0.0 and Euclidean distance 

`source("ttosom.r")`
`ttosom(dataset="iris.arff",topology="topology.txt",iterations="100000",initRadius="8",finalRadius="0",`
`initLearning="0.9",finalLearning="0.0",distance="0",stats="-x",option_stats="10")`
