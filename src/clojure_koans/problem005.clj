(ns clojure-koans.problem005)
;Problem #005
(defn problem
[answer]
(and 
  (= answer (conj '(2 3 4) 1)) 
  (= answer (conj '(3 4) 2 1))))

(problem '(1 2 3 4)) 
