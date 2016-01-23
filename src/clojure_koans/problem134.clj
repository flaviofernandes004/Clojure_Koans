(ns clojure-koans.problem134)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (true?  (answer :a {:a nil :b 2}))
      (false? (answer :b {:a nil :b 2}))
      (false? (answer :c {:a nil :b 2}))))

(problem (fn 
          [x m]
          (and 
            (contains? m x) 
            (nil? (x m)))))
