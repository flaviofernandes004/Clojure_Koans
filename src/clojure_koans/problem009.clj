(ns clojure-koans.problem009)
;Problem #009
(defn problem
[answer]
(= #{1 2 3 4} (conj #{1 4 3} answer)))

(problem 2) 
