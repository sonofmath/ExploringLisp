(require '[clojure.string :as str])
(def index 0)
(def token " ")
(def tokens [1,2])
(def error false)

(defn getToken []
  (if (> (count tokens) index)
    (do
      (def token (nth tokens index))
      ;Notice way increment is done
      (def index (inc index))
      (newline)
      (print "  <getToken> ",token)
      (if (= token "+")
          (getToken))
      (if (= token "*")
          (getToken)))))

(defn exp []
  (print " <exp> ")
  (term)
  (while (= token "+")
    (do
       (getToken)
       (term))))

(defn digit []
  (print " <digit> ")
  (if (number? token)
    (getToken)))

(defn number []
  (print " <number> ")
  (digit)
  (while (number? token)
    (getToken)))

(defn factor []
  (print " <factor> ")
  (if (= token "(")
    (do 
      (getToken)
      (exp)
      (if (= token ")")
        (getToken)
        ;;;Else
        (print "Error")))
    ;;;Else
    (number)))

(defn term []
  (print " <term> ")
  (factor)
  (while (= token "*")
    (do 
      (getToken)
      (factor))))

(defn parse [statement]
  (newline)
  ;;;Reset Values
  (def index 0)
  (def token " ")
  (def tokens [1,2])
  (def error false)

  ;;Split the string into individual characters and store in tokens list
  (def tokens (str/split statement #""))
  ;;Prints the all the characters in the expression
  (println "==================================================================")
  (println "Inserting:",statement)
  (println "==================================================================")
  (print " <parse> ")
  (getToken)
  (exp))

(parse "(2)")