(println "Welcome the Fibonacci program!") (println)

;Macro definition - Like defn, but the resulting function name is declared as a
;macro and will be used as a macro by the compiler when it is called.
(defmacro sectime [expr]
  `(let [start# (. System (currentTimeMillis))
         ret# ~expr]
     ;;;str connects two strings
     (println (str "Elapsed time: " (/ (double (- (. System (currentTimeMillis)) start#)) 1000.0) " seconds"))
     ret#))

;;;Counts the number of times fib was called
(def iter 0)

;Function definition of fib
(defn fib [n]
  (def iter (+ iter 1))
  (if (< n 2)
   ;;;Base case
    n
   ;;;Inductive case
    (+ (fib (- n 1))
       (fib (- n 2)))))
  
(println "The 30th fibonacci number is:" (fib 30))
(println "Fib function was called:" iter "times.")
(sectime(fib 30))