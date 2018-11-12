(ns mathtests.core
  (:gen-class))

(defn factorial [n]
  (if (= n 1)
    n
    (* n (factorial (dec n)))))

(defn -main [& args]
  (println "The answer is: " (factorial 5)))
