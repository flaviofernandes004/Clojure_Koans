(ns clojure-koans.problem021)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer '(4 5 6 7) 2) 6)
      (= (answer [:a :b :c] 0) :a)
      (= (answer [1 2 3 4] 1) 2)
      (= (answer '([1 2] [3 4] [5 6]) 2) [5 6])))

(problem (fn
          [ls n]
            (if (= 0 n)
              (first ls)
              (recur (rest ls) (dec n)))))
