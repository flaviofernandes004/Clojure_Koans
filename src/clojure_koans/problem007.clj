(ns clojure-koans.problem007)
;Problem #007
(defn problem
[answer]
(and 
  (= answer (conj [1 2 3] 4))
  (= answer (conj [1 2] 3 4))))

(problem [1 2 3 4]) 
