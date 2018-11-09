;Uses Java Pi function to print PI
(defn printPi []
  ;;; Notice that "." is a function lol
  (println "Printing Pi:"(. Math PI)))
(printPi)

;Tells us what java JDK verion we are using
(defn printVersion []
  (println "System is using JDK version:" (.. System getProperties (get "java.version"))))
(printVersion)

;Here we use the Java Stack library in java.util.stack
(println "Java Stack test:")
(import java.util.Stack)
(defn cljJavaStackExample []
  (let [stack (Stack.)]
    (.push stack 1)
    (.push stack 2)
    (.push stack 3)
    (.push stack 4)
    (println (.peek stack))))
(cljJavaStackExample)

;An example where I create a linked list!
(println "Java LinkedList test:")
(import java.util.LinkedList)
(defn javaLinkedList []
  (let [list (LinkedList.)]
    (.add list "JR")
    (.add list "RAY")
    (.add list "BEN")
    (println (.get list 0))
    (println (.get list 1))
    (println (.get list 2))))
(javaLinkedList)