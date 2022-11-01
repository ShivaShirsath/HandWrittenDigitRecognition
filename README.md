A simple neural network that recognise handwritten characters


+ The neural network is written in C++.

+ Instead, the GUI and the application of the neural network is written in Java
  + involves
    + loading MNINST images
    + scaling and converting them to an usable format
    + so on...
+ C++ neural network functionalities are accessed from Java through JNI. 

> Currently there are pre-compiled natives only for Windows x64 and Linux x64 that will be loaded dinamically when starting the Java application. 

> If you need to run this on other SO you have to compile the C++ source to get an external library file (.so on linux, .dll on windows etc...) that you need to load into the java NeuralNetwork class. Search about Java JNI to get more info on how to link native libraries to java code.

+ Training/Test data used in the above can be found here: [dataset](../../tree/dataset)
  - [t10k-images-idx3-ubyte.gz](../../raw/dataset/t10k-images-idx3-ubyte.gz)
  - [t10k-labels-idx1-ubyte.gz](../../raw/dataset/t10k-labels-idx1-ubyte.gz)
  - [train-images-idx3-ubyte.gz](../../raw/dataset/train-images-idx3-ubyte.gz)
  - [train-labels-idx1-ubyte.gz](../../raw/dataset/train-labels-idx1-ubyte.gz)

Pre-compiled versions & Executable **.jar** file can be found in [```Releases```](../../releases#:~:text=HandWrittenDigitRecognition).

## How to build the application

- You can build the application by using gradle.
- Java JDK min 1.8 is necessary to build this project.
- Open the terminal and move to the root of this project then execute
  ```bash
  gradlew assemble
  ```

Build files will be generated into a folder named ```build```.

The executable ```.jar``` will be generated into ```build/libs```.

double click on ```.jar``` file for execution of Application.

<details>
<summary>Build required C++ natives for other platforms</summary>
<br/>

- This version comes with pre-compiled Windows x64 and Linux x64 natives.
- If you want this application to run on a diffent OS you need to
compile the C++ sources. 

> Source files are located into [```src/main/cpp```](../../tree/master/src/main/cpp). You need CMake to compile the library.

</details>
