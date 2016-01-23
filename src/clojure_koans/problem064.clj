(ns clojure-koans.problem064)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= 15 (reduce answer [1 2 3 4 5]))
      (=  0 (reduce answer []))
      (=  6 (reduce answer 1 [2 3]))))

(problem +)
