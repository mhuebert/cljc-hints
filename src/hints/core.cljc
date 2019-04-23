(ns hints.core
  (:require [hints.my-type :as t])
  #?(:cljs (:require-macros hints.core)))

(defn self [^t/MyType x] x)

;; assume that we have some other macros in this file, hence :require-macros