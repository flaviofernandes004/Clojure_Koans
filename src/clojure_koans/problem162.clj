(ns clojure-koans.problem162)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= answer (if-not false 1 0))
      (= answer (if-not nil 1 0))
      (= answer (if true 1 0))
      (= answer (if [] 1 0))
      (= answer (if [0] 1 0))
      (= answer (if 0 1 0))
      (= answer (if 1 1 0))))

(problem 1)
