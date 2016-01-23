(ns clojure-koans.problem135)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= 7  (answer 2 + 5))
      (= 42 (answer 38 + 48 - 2 / 2))
      (= 8  (answer 10 / 2 - 1 * 2))
      (= 72 (answer 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))))

(problem (fn
            [x a y & xs]
            (if(= (count xs) 0)
            (a x y)
              (recur (a x y) (first xs) (second xs) (drop 2 xs)))))
