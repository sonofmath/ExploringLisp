(require '[clojure.string :as str])
(def index 0)
(def token " ")
(def tokens [1,2])
(def error false)
(def endParse false)

(defn isDigit [s]
  (if (= s \0)
    true
    (if (= s \1)
      true
      (if (= s \2)
        true
        (if (= s \3)
          true
          (if (= s \4)
            true
            (if (= s \5)
              true
              (if (= s \6)
                true
                (if (= s \7)
                  true
                  (if (= s \8)
                    true
                    (if (= s \9)
                      true
                      false)))))))))))

;Funtion "Prototypes"
(defn getToken [])
(defn digit [])
(defn number [])
(defn exp [])
(defn factor [])
(defn term [])

(defn getToken []
  (if (> (count tokens) index)
    (do
      (def token (nth tokens index))
      ;Notice way increment is done
      (def index (inc index))
      (newline)
      (print "  <getToken> ",token))
    ;;;Else
    (def endParse true)))

(defn digit []
  (print " <digit> ")
  (if (and (isDigit token) (not= endParse true))
    (getToken)
    ;;;Else
    (print "Error - in digit")))

(defn number []
  (print " <number> ")
  (digit)
  (while (and (isDigit token) (not= endParse true))
    (digit)))

(defn exp []
  (print " <exp> ")
  (term)
  (while (and (= token \+ ) (not= endParse true))
    (do
        (getToken)
        (term))))

(defn factor []
  (print " <factor> ")
  (if (= token \( )
    (do 
      (getToken)
      (exp)
      (if (= token \) )
        (getToken)
        ;;;Else
        (println "Error - in factor ")))
    ;;;Else
    (number)))        

(defn term []
  (print " <term> ")
  (factor)
  (while (and (= token \* ) (not= endParse true))
    (do 
      (getToken)
      (factor))))

(defn parse [statement]
  (newline)

  ;;;Reset Values
  (def index 0)
  (def token " ")
  (def tokens (char-array " "))
  (def error false)
  (def endParse false)

  ;;Split the string into individual characters and store in tokens list
  (def tokens (char-array statement))
  ;;Prints the all the characters in the expression
  (println "==================================================================")
  (println "Inserting:",statement)
  (println "==================================================================")
  (print " <parse> ")
  (getToken)
  (exp))

(parse "3+4*5+6*7")
(parse "((2))")



