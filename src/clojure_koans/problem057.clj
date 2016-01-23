(ns clojure-koans.problem057)
  ;Problem #
  (defn problem
    [answer]
    (= answer ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))

(problem [5 4 3 2 1])
