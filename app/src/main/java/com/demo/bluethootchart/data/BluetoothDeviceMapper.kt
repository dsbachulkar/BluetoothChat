package com.demo.bluethootchart.data

import com.demo.bluethootchart.domain.chat.BluetoothDevice
import com.demo.bluethootchart.domain.chat.BluetoothDeviceDomain

fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}