package com.abc

import grails.transaction.Transactional

@Transactional
class LogService {

    def saveLog(String eventName) {
      def l = new Log(event: eventName, eventDate: new Date())
      l.save()
    }
}
