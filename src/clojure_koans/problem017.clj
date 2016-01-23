(ns clojure-koans.problem017)
  ;Problem #
  (defn problem
    [answer]
    (= answer (map #(+ % 5) '(1 2 3))))

(problem '(6 7 8))
