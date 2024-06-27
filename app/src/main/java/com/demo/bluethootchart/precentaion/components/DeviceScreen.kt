package com.demo.bluethootchart.precentaion.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.demo.bluethootchart.domain.chat.BluetoothDevice
import com.demo.bluethootchart.precentaion.BluetoothUiState

@Composable
fun DeviceScreen(
    state: State<BluetoothUiState>,
    onStateScan:() -> Unit,
    onStopScan:() -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Button(onClick = onStateScan) {
                Text(text = "Start Scan")
            }
        Button(onClick = onStopScan) {
            Text(text = "Stop Scan")
        }
    }

}


@Composable
fun BluetoothDeviceList(
    pairredDevices:List<BluetoothDevice>,
    scannedDevices: List<BluetoothDevice>,
    onClick: (BluetoothDevice) -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn (modifier = modifier){
        item{
            Text(
                text = "Paired Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(pairredDevices){ device ->
            Text(text = device.name?:"(No name)",
            modifier = Modifier.fillMaxWidth()
                .clickable { onClick(device) }
                .padding(16.dp)
            )
        }

        item{
            Text(
                text = "Scanned Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(scannedDevices){ device ->
            Text(text = device.name?:"(No name)",
                modifier = Modifier.fillMaxWidth()
                    .clickable { onClick(device) }
                    .padding(16.dp)
            )
        }

    }

}