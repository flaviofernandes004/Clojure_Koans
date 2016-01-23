(ns clojure-koans.problem012)
  ;Problem #
  (defn problem
    [answer]
    (and (= answer (first '(3 2 1)))
         (= answer (second [2 3 4]))
         (= answer (last (list 1 2 3)))))

(problem 3)
