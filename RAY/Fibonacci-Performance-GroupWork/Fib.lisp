(format t "Welcome the Fibonacci program! ~%")

(defvar *times 0)

(defun fib(n)
  ;;;Counts the number of times fib was called
  (setq *times (+ *times 1))
  "Return the nth Fibonacci number."
  (if (< n 2)
   ;;;Base case
    n
   ;;;Inductive case
    (+ (fib (- n 1))
       (fib (- n 2)))))

(format t "The 35th fibonacci number is: ") (print (time (fib 35))) (format t "~%")
(format t "Fib function was called: ") (print *times) (format t "times.")
